package org.valrod.main.mooc.backend.command;


import org.valrod.shared.infrastructure.cli.ConsoleCommand;

public class FakeCommand extends ConsoleCommand {
    @Override
    public void execute(String[] args){
        info("This is a fake command!");
    }
}
