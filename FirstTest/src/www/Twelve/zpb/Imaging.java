/*
 * 2. 请编码实现：圆形和矩形都能计算面积、计算周长、还可以填充颜色
提示：
父类：图形类(抽象类)
      方法：1.计算周长（抽象方法）
            2.计算面积（抽象方法）
            3.填充颜色 (抽象方法)

子类：矩形 继承 父类
           重写抽象方法
*/
package www.Twelve.zpb;
//图形类
public  abstract class Imaging{	
	static double a,b,h,r;    
	static double π=3.14;
	public abstract void girth();
	public abstract void area();
	public abstract void color();
	

}
