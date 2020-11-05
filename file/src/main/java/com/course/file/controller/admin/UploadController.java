package com.course.file.controller.admin;

import com.course.server.dto.ResponseDto;
import com.course.server.util.UuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping("/admin")
@RestController
public class UploadController {

    private static final Logger Log = LoggerFactory.getLogger(UploadController.class);


    @RequestMapping("/upload")
    public ResponseDto upload(@RequestParam MultipartFile file) throws IOException {
        Log.info("上传文件开始：{}",file);
        Log.info(file.getOriginalFilename());
        Log.info(String.valueOf(file.getSize()));

        //保存文件到本地
        String fileName = file.getOriginalFilename();
        String key = UuidUtil.getShortUuid();
        String fullPath = "D:/Git/ZiroomCode/imooc/file/course/teacher/" + key + "-" + fileName;
        File dest = new File(fullPath);
        file.transferTo(dest);
        Log.info(dest.getAbsolutePath());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setContent("http://127.0.0.1:9000/file/f/teacher/" + key + "-" + fileName);
        return responseDto;
    }
}
