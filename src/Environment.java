/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */
	
import java.util.*;

/**
 * An instance of class <code>Environment</code> maintains a
 * collection of bindings from valid identifiers to integers.
 * It supports storing and retrieving bindings, just as would
 * be expected in any dictionary.
 *
 * @author <a href="mailto:dcoore@uwimona.edu.jm">Daniel Coore</a>
 * @version 1.0
 */
public class Environment {

    HashMap dictionary;		//local bindings
    Environment parent;		// parent enviroment
    HashMap<String, ProcDef> functionTable;	// local table of functions

    /**
     * Create a new (empty) top level Environment.
     *
     */
    public Environment(HashMap map) {
		dictionary = map;
    }
    public Environment() {
		dictionary = new HashMap();
		parent = null;
		functionTable = new HashMap<String, ProcDef>();
    }
    /**
     * Create a new environment with an empty first frame, inheriting the
     * bindings of the given environment.
     *
     */
    public Environment(Environment p) {
		dictionary = new HashMap();
		parent = p;
		functionTable = new HashMap<String, ProcDef>();
    }

    /**
     * Creates a new <code>Environment</code> instance that is
     * initialised with the given collection of bindings
     * (presented as separate arrays of names and values).
     *
     * @param ids the collection of identifiers to be bound.
     * @param values the corresponding collection of values
     * for the identifiers.  Note that the two arrays must
     * have the same length.
     */
    public Environment(String[] ids, int[] values, Environment parent) {
		dictionary = new HashMap();
		this.parent = parent;
		functionTable = new HashMap<String, ProcDef>();
		for (int i = 0; i < ids.length; i++) {
			put(ids[i], values[i]);
		}
    }

    /**
     * Create an instance of a global environment suitable for
     * evaluating an program.
     *
     * @return the <code>Environment</code> created.
     */
    public static Environment makeGlobalEnv() {
	Environment result =  new Environment();
		// add definitions for any primitive procedures or
		// constants here
		return result;
    }

	public void putFun(String name, ProcDef f) {
		functionTable.put(name, f);
    }
    
    /**
     * Store a binding for the given identifier to the given
     * int within this environment.
     *
     * @param id the name to be bound
     * @param value the value to which the name is bound.
     */
    public void put(String id, Object value) {
		dictionary.put(id, value);
    }
    
    public ProcDef getFun(String name) throws Exception {
		ProcDef result = functionTable.get(name);
		if (result == null)
			if (parent == null)
			throw new Exception("Undefined function " + name);
			else
			return parent.getFun(name);
		else
			return result;
    }


    /**
     * Return the int associated with the given identifier.
     *
     * @param id the identifier.
     * @return the int associated with the identifier in
     * this environment.
     * @exception Exception if <code>id</code> is unbound
     */
   public Object get(String id) throws Exception {
	Object result = (Object) dictionary.get(id);
	if (result == null)
	    if (parent == null)
		throw new Exception("Unbound variable " + id);
	    else
		return parent.get(id);
	else
	    return result;
    }

    public HashMap getAll() throws Exception {

        return dictionary;
    }
    /**
     * Create a string representation of this environment.
     *
     * @return a string of all the names bound in this
     *         environment.
     */
    public String toString() {
    	System.out.println("Environment variables: ");
		StringBuffer result = new StringBuffer();

		Iterator iter = dictionary.keySet().iterator();
		while (iter.hasNext()) {
			result = result.append(iter.next().toString()+",");
		}
		return result.toString();
    }

}



	
