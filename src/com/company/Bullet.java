package com.company;

import javax.imageio.ImageIO;
import java.io.File;
public class Bullet extends Element {
    protected int damage ;
    public enum bulletType{normal , frozen}
    private bulletType bulletType;
    public Bullet(int x , int y , bulletType bulletType) throws Exception {
        setX(x);
        setY(y);
        this.bulletType = bulletType;
        setFields();
    }

    public Bullet.bulletType getType() {
        return bulletType;
    }

    public void setType(Bullet.bulletType type) {
        this.bulletType = type;
    }
    private void setFields() throws Exception {
            if(bulletType == bulletType.normal){

                this.damage = 30;
                img = ImageIO.read(new File("images\\pea.png"));

            }else if(bulletType == bulletType.frozen){

                this.damage = 35;
                img = ImageIO.read(new File("images\\freezepea.png"));


            }else throw new Exception(" No bullet type found !!!!");
    }


    public boolean endOfFeild(){
        if(this.getX() > 1000)return true;
        else return false;
    }
}
