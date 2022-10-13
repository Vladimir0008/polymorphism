package obstaclecourse.obstacles;

import obstaclecourse.members.Member;

public abstract class Obstacle {
    public int difficultLevel;

    public abstract boolean overcome(Member member);

}
