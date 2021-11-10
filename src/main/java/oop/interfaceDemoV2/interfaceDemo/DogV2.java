package oop.interfaceDemoV2.interfaceDemo;


//
//

/**
 * 最後實現類 不能在使用 public abstract class DogV2 ...
 * 流程：
 * interface 只有聲明方法，但沒有方法體
 * abstract 可以聲明方法並可以有方法體
 * class 實現類
 * 差別：
 * 可以 implements 多個 interface
 * 不可以 extend 多個 父類
 */
public class DogV2 extends Dog {

    public void makeSoundAndSpeak() {
        super.makeSound();
        super.speak();
    }

//	public void speak() {
//		super.speak();
//	}
}
