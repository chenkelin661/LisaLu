package com.example.colin.dev.march.TwentyFirst.controller;

import com.example.colin.dev.march.TwentyFirst.dto.DemoEntity;
import com.example.colin.dev.march.TwentyFirst.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目描述：功能测试.
 *
 * @author mpw
 * @since 2024/03/21
 */

@RestController
@Slf4j
@RequestMapping("colin")
public class ColinFirstDemoController {

    @Resource
    private DemoService demoService;

    @PostMapping("/demo")
    public List<DemoEntity> getFirstTest(DemoEntity demoEntity) {
        List<DemoEntity> result = demoService.getFirstTest(demoEntity);
        return result;
    }


//    public static void main(String[] args) throws IOException {
//        String filePath = "C:/Users/HW/Desktop/排序字段.txt";
////        FileReader reader = new FileReader(filePath);
////        int character;
////        while ((character = reader.read()) != -1) {
////            System.out.print((char) character);
////        }
//
//
//        BufferedReader reader = new BufferedReader(new FileReader(filePath));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            if (line.contains("嘿嘿")){
//                System.out.println(line);
//            }
//        }
//
//
//    }


    @Test
    public void BinarySearchNoRecur() {

        int[] arr = {1, 3, 6, 66, 89, 93,99};
        int target = 1;
        int result = binarySearch(arr, target);
        System.out.println(result);

    }

    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        int i=0;
        while (left <= right) {
            int mid = (left + right) / 2;
            log.info("查询次数[{}]",++i);
            if (mid > right) {
                return -1;
            }
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;
    }




    public static void move(int n, char from, char to) {
        System.out.println("Move disk " + n + " from " + from + " to " + to);
    }

    // 递归实现汉诺塔算法
    public static void hanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            move(1, from, to);
        } else {
            hanoi(n - 1, from, aux, to); // 将 n-1 个圆盘从 from 移动到 aux
            move(n, from, to);           // 将第 n 个圆盘从 from 移动到 to
            hanoi(n - 1, aux, to, from); // 将 n-1 个圆盘从 aux 移动到 to
        }
    }

    public static void main(String[] args) {
        int n = 64; // 圆盘数量
        hanoi(n, 'A', 'C', 'B'); // 将 n 个圆盘从 A 移动到 C，B 作为辅助柱
    }



}