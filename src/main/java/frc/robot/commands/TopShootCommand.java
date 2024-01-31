package frc.robot.commands;

import javax.annotation.processing.SupportedOptions;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CoolSubsystem;

public class TopShootCommand extends Command{
    CoolSubsystem coolSubsystem;
    public TopShootCommand(CoolSubsystem coolSubsystem){
        this.coolSubsystem = coolSubsystem;
    }
    
    @Override
    public void initialize() {
        coolSubsystem.shootTop();
    }

    @Override
    public void execute(){
        coolSubsystem.shootTop();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
