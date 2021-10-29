package io.github.wangyuheng.arc.generator.conf;

import java.util.Arrays;

/**
 * 生成代码的类型
 *
 * @author yuheng.wang
 */
public enum CodeGenType {

    TYPE("type"),
    REPO("repo"),
    DATA_FETCHER("datafetcher"),
    INPUT("input"),
    DICTIONARY("dictionary");

    private final String dirName;

    CodeGenType(String dirName) {
        this.dirName = dirName;
    }

    public String getDirName() {
        return dirName;
    }

    public static CodeGenType parse(String packageName) {
        String dirName = packageName.substring(packageName.lastIndexOf('.') + 1);
        return Arrays.stream(CodeGenType.values())
                .filter(genType -> genType.dirName.equals(dirName))
                .findAny()
                .orElseThrow(NullPointerException::new);
    }
}
