/*
 Copyright (c) 2018, Kansas State University
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 1. Redistributions of source code must retain the above copyright notice, this
    list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.sireum.aadl.ir;

import java.util.List;

public class AadlASTJavaFactory {

    public enum ComponentCategory {
        Abstract, Bus, Data, Device, Memory, Process, Processor, Subprogram,
        SubprogramGroup, System, Thread, ThreadGroup, VirtualBus, VirtualProcessor
    }

    private static AadlASTFactory f = new AadlASTFactory();

    public static Aadl aadl(List<Component> components,
                            List<Emv2Library> errorLib) {
        return f.aadl(components, errorLib);
    }

    public static Name name(List<String> name) {
        return f.name(name);
    }

    public static Component AadlFactory(Name identifier,
                              ComponentCategory category,
                              Classifier classifier,
                              List<Feature> features,
                              List<Component> subComponents,
                              List<Connection> connections,
                              List<ConnectionInstance> connectionInstances,
                              List<Property> properties,
                              List<Flow> flows,
                              List<Mode> modes,
                              List<Annex> annexes) {
        return f.component(identifier,
                category, classifier, features, subComponents, connections,
                connectionInstances, properties, flows, modes, annexes);
    }

}
