package com.yupi.acm;

import java.util
/**
* ACM 输入模板（多数之和）
* @author RayMind
*/
public class MainTemplate {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// 读取输入元素
int n = scanner.nextInt();
// 读取数组
int[] arr = new int[n];
for (int i = 0; i < n; i++) {
arr[i] = scanner.nextInt();
}

// 处理问题逻辑，根据需要进行输出
// 示例：计算数组元素的和
int sum = 0;
for (int num : arr) {
sum += num;
}

System.out.println("两数之和等于:  " + sum);

scanner.close();
}
}
