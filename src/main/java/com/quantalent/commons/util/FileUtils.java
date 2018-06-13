package com.quantalent.commons.util;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.Charset;

public class FileUtils {

    public static byte[] readBytesFromFilePath(String path) throws IOException {
        return IOUtils.toByteArray(new FileInputStream(path));
    }

    public static String readStringFromFilePath(String path) throws IOException {
        return IOUtils.toString(new FileInputStream(path), Charset.forName("UTF-8"));
    }

}
