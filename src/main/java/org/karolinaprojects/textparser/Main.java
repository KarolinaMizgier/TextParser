package org.karolinaprojects.textparser;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<String> list = FileUtil.read("src/main/resources/Text");

        Splitter splitter = new MySentenceSplitter();
        List<String> splitted = splitter.split(FileUtil.readText("src/main/resources/Text"));
        splitted.stream().forEach(line->{
               System.out.println(line);
                });
    }
}
