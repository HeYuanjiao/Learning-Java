/**
 * @author Liu Awen
 * @create 2018-05-07 9:53
 */
/*
了解：浮点型的float和double在底层如何存储？
计算机中只有二进制？
那么如果存储3.14？
小数涉及：（1）整数部分（2）小数部分（3）这个.（4）正负号
如何底层存储呢

计算机中只有二进制？
那么如何存储3.14呢？

化繁为简：
1、小数-->二进制：
（1）整数部分：除2倒取余
（2）小数部分：乘2取整数部分
小数 二进制
整数部分 除2倒取余
3.14==》11.00100...
截取
2、把这个二进制用科学记数法表示
	1.1 00100.... * n的1次方
用科学计数法表示后，对于二进制的科学计数法，整数部分永远是1，那这样的话，
整数部分就不用存了，小数点也不存了
移动  移位   整数部分永远是1 小数点也不需要存储了

只要存三个内容：（1）正负号（2）挪完后的几次方，指数（3）二进制的小数部分（称为尾数）
float：4个字节，就被分为三个部分，最高位还是符号位，
接下来的8位用来存指数部分，然后剩下的存尾数，额如果存不下的尾数，就舍去了
1 8 23
double：8个字节，就被分为三个部分，最高位还是符号位，
接下来的11位用来存指数部分，然后剩下的存尾数，额如果存不下的尾数，就舍去了
1 11 52
了解：
（1）浮点类型不精确，因为十进制的小数部分转二进制会需要舍去
（2）float类型的4个字节能表示的数字范围比long类型的8个字节还要大
因为浮点型底层存的是指数

*/
public class Test02_FloatDoubleSave{
}