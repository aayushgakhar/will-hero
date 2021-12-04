package game.willhero;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Objects;

public class Hero extends GameObject {

    private Helmet helmet;
    private ArrayList<Weapon> weapons;
    private Weapon currentWeapon;
    private long moves;

    public Helmet getHelmet(){
        return this.helmet;
    }

    public ArrayList<Weapon> getWeapons(){
        return this.weapons;
    }

    public Weapon getCurrentWeapon(){
        return this.currentWeapon;
    }

    public long getMoves(){
        return this.moves;
    }

    public void setHelmet(Helmet helmet){
        this.helmet = helmet;
    }

    public void setCurrentWeapon(Weapon currentWeapon){
        this.currentWeapon = currentWeapon;
    }

    public void setMoves(long moves){
        this.moves = moves;
    }

    Hero(double x, double y) {
        super(new Vector(x,y),new Vector(0,0),new Vector(0,500),"assets/hero.png");
    }
    Hero(double x, double y,ImageView imageView) {
        super(new Vector(x,y),new Vector(0,0),new Vector(0,500),imageView);
    }

    Hero(Vector position, Vector velocity, Vector acceleration, ImageView imageView) {
        super(position, velocity, acceleration, imageView);
    }

}
