/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.maven.legal;

import java.io.File;

import org.apache.maven.plugin.Mojo;
import org.apache.maven.plugin.testing.AbstractMojoTestCase;

public class PackageLegalMojoTest extends AbstractMojoTestCase {
    private File pluginXmlFile;
    

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        
        this.pluginXmlFile = new File( getBasedir(), "src/test/resources/plugin-configs/jasig-legal-plugin-config.xml");
    }


    public void testReport() throws Exception {
        Mojo mojo = lookupMojo( "copy-files", pluginXmlFile );
        assertNotNull( "Mojo found.", mojo );
        
        mojo.execute();
    }
}
