package com.bonaparte.controller;

import com.bonaparte.util.AESAlgorithm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
@RequestMapping("/cryptology")
public class CryptologyController {

    @RequestMapping("/aes")
    public static void main(String[] args) {
        AESAlgorithm aesAlgorithm =new AESAlgorithm();
        Scanner scanner=new Scanner(System.in);
        /*
         * 加密
         */
        System.out.println("使用AES对称加密，请输入加密的规则");
        String encodeRules=scanner.next();
        System.out.println("请输入要加密的内容:");
        String content = scanner.next();
        System.out.println("根据输入的规则"+encodeRules+"加密后的密文是:"+aesAlgorithm.AESEncode(encodeRules, content));

        /*
         * 解密
         */
        System.out.println("使用AES对称解密，请输入加密的规则：(须与加密相同)");
        encodeRules=scanner.next();
        System.out.println("请输入要解密的内容（密文）:");
        content = scanner.next();
        System.out.println("根据输入的规则"+encodeRules+"解密后的明文是:"+aesAlgorithm.AESDecode(encodeRules, content));
    }

}
