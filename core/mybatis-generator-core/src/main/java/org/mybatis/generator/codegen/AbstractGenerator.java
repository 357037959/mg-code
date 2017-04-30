/**
 *    Copyright 2006-2016 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.generator.codegen;

import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.PropertyRegistry;

/**
 * 
 * @author Jeff Butler
 * 
 */
public abstract class AbstractGenerator {
    protected Context context;
    protected IntrospectedTable introspectedTable;
    protected List<String> warnings;
    protected ProgressCallback progressCallback;

    public AbstractGenerator() {
        super();
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public IntrospectedTable getIntrospectedTable() {
        return introspectedTable;
    }

    public void setIntrospectedTable(IntrospectedTable introspectedTable) {
        this.introspectedTable = introspectedTable;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }

    public ProgressCallback getProgressCallback() {
        return progressCallback;
    }

    public void setProgressCallback(ProgressCallback progressCallback) {
        this.progressCallback = progressCallback;
    }

    public String getRootClass() {
    	String rootClass = context.getProperty(PropertyRegistry.CONTEXT_BASE_BEAN_CLASS);
    	if (rootClass != null) {
        	return rootClass;
        }
    	
        rootClass = introspectedTable.getTableConfigurationProperty(PropertyRegistry.ANY_ROOT_CLASS);
        if (rootClass != null) {
        	return rootClass;
        }
        
        Properties properties = context.getJavaModelGeneratorConfiguration().getProperties();
        rootClass = properties.getProperty(PropertyRegistry.ANY_ROOT_CLASS);
        return rootClass;
    }
    
    public String getSqlProviderClass() {
    	String sqlProviderClass = context.getProperty(PropertyRegistry.CONTEXT_SQL_PROVIDER_CLASS);
    	if (sqlProviderClass != null) {
        	return sqlProviderClass;
        }
    	
        sqlProviderClass = introspectedTable.getTableConfigurationProperty(PropertyRegistry.ANY_SQL_PROVIDER_CLASS);
        if (sqlProviderClass != null) {
        	return sqlProviderClass;
        }
        
        Properties properties = context.getJavaClientGeneratorConfiguration().getProperties();
        sqlProviderClass = properties.getProperty(PropertyRegistry.ANY_SQL_PROVIDER_CLASS);
        return sqlProviderClass;
    }
    
    public String getExampleClass() {
    	String exampleClass = null;
//    	exampleClass = context.getProperty(PropertyRegistry.CONTEXT_BASE_EXAMPLE_CLASS);
//    	if (exampleClass != null) {
//        	return exampleClass;
//      }
    	
    	exampleClass = introspectedTable.getTableConfigurationProperty(PropertyRegistry.ANY_EXAMPLE_CLASS);
    	if (exampleClass != null) {
    		return exampleClass;
    	}
    	
    	Properties properties = context.getJavaModelGeneratorConfiguration().getProperties();
		exampleClass = properties.getProperty(PropertyRegistry.ANY_EXAMPLE_CLASS);
    	return exampleClass;
    }
    
}
