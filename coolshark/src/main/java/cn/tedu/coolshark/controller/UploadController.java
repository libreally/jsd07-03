package cn.tedu.coolshark.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 上传与删除文件功能
 */
@RestController
public class UploadController {
    @Value("${dirPath}")
    private String dirPath;
    @RequestMapping("/upload")
    public String upload(MultipartFile pic) throws IOException {
        //pic为客户端name中的文件
        System.out.println("picture = " + pic);
        //获取原始文件名
        String filename = pic.getOriginalFilename();
        System.out.println("原始文件名 : " + filename);
        //获取原始名后缀
        String suffix = filename.substring(filename.lastIndexOf("."));
        //得到唯一的文件名UUID.randomUUID()
        filename = UUID.randomUUID() + suffix;
        System.out.println("唯一文件名 = " + filename);
        //设置保存图片路径
        File dirFile = new File(dirPath);
        if (!dirFile.exists()){
            dirFile.mkdirs();
        }
        //获取文件的完整路径 d:/files/xxx.jpg
        String filePath = dirPath + "/" + filename;
        //将图片保存到filePath路径中
        pic.transferTo(new File(filePath));

        //把图片的url路径响应给客户端      /文件名
        return "/"+filename;
    }
    @RequestMapping("/remove")
    public void remove(String url){
        //删除磁盘上的文件
        new File(dirPath+url).delete();
    }
}
