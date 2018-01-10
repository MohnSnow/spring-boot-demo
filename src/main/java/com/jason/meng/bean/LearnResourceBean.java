package com.jason.meng.bean;

/**
 * @author MengDexin
 * @date 2018/01/10 11:10
 **/

public class LearnResourceBean {

    private String name;
    private String englishName;
    private String url;

    public LearnResourceBean(String url, String name, String englishName) {
        this.url = url;
        this.name = name;
        this.englishName = englishName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "LearnResourceBean{" +
                "name='" + name + '\'' +
                ", englishName='" + englishName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
