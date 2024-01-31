package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.subsystems.CoolSubsystem;

public class AmpCommand extends ParallelCommandGroup {
    CoolSubsystem coolSubsystem;

    public AmpCommand(CoolSubsystem coolSubsystem){
        this.coolSubsystem = coolSubsystem;
        addCommands(new FeedCommand(coolSubsystem), new TopShootCommand(coolSubsystem));
    }
    
}
