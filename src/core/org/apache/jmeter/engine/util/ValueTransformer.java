/*
 * Created on May 4, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package org.apache.jmeter.engine.util;

import java.util.Map;

import org.apache.jmeter.functions.InvalidVariableException;
import org.apache.jmeter.testelement.property.JMeterProperty;

/**
 * @author ano ano
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
interface ValueTransformer
{
    
    /**
     * Transform the given property and return the new version.
     * @param property
     * @return the transformed property
     */
    public JMeterProperty transformValue(JMeterProperty property) throws InvalidVariableException;
    
    /**
     * Set the master function for the value transformer.  This handles converting strings to functions.
     * @param masterFunction
     */
    public void setMasterFunction(CompoundVariable masterFunction);
    
    /**
     * Set the variable names and values used to reverse replace functions with strings, and undo functions to raw values.
     * @param vars
     */
    public void setVariables(Map vars);
    
    
}
