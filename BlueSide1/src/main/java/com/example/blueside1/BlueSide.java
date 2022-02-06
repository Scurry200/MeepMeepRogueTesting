package com.example.blueside1;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class BlueSide {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(600);
        RoadRunnerBotEntity blueLeft = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, 70, Math.toRadians(-90)))
                                .splineTo(new Vector2d(-4, 36), Math.toRadians(-90))
                                .turn(Math.toRadians(-225))
                                .splineTo(new Vector2d(55,63),Math.toRadians(0))
                                .setReversed(true)
                                .splineTo(new Vector2d(-4, 32), Math.toRadians(-135))
                                .setReversed(false)
                                .splineTo(new Vector2d(55,63),Math.toRadians(0))





                                .build()
                );












        RoadRunnerBotEntity blueRight = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-35, 70, Math.toRadians(-90)))
                                .splineTo(new Vector2d(-23, 24), Math.toRadians(-90))
                                .turn(Math.toRadians(-120))
                                .turn(Math.toRadians(-60))
                                .splineTo(new Vector2d(-62.5,62),Math.toRadians(180))
                                .lineTo(new Vector2d(-54,57))




                                .build()
                );

        meepMeep.setBackground(MeepMeep.Background.FIELD_FREIGHTFRENZY_ADI_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(blueRight)
                //.addEntity(redLeft)

                //.addEntity(redRight)

                .start();
    }
}