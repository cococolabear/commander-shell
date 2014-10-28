package com.github.nikolavp.commander;

/*
 * #%L
 * com.github.nikolavp:commander-shell
 * %%
 * Copyright (C) 2014 Nikolavp
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.beust.jcommander.JCommander;

import java.util.List;

/**
 * An interface representing shell command groups.
 *
 * @author nikola.
 */
public interface ShellCommandGroup {
    /**
     * Builds the commands that are going to be used in this command group.
     *
     * @param jCommander the jcommander object on which we are going to attach the commands. Some commands like the {@link com.github.nikolavp.commander.commands.Help} command need this.
     * @return the list of commands for command group
     */
    List<Object> buildCommands(JCommander jCommander);
}
