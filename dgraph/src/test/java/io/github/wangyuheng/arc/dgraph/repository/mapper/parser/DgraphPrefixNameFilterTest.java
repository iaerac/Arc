package io.github.wangyuheng.arc.dgraph.repository.mapper.parser;

import io.github.wangyuheng.arc.dgraph.repository.parser.DgraphPrefixNameFilter;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DgraphPrefixNameFilterTest {

    @Test
    public void json_key_should_append_prefix() {
        String prefix = "abc" + ".";
        DgraphPrefixNameFilter prefixNameFilter = new DgraphPrefixNameFilter(prefix);

        Parent parent = new Parent();
        parent.setName("papa");
        parent.setChildren(Arrays.asList(new Child("b0"), new Child("b1")));

        String jsonStr = JSON.toJSONString(parent, prefixNameFilter);
        JSONObject json = JSON.parseObject(jsonStr);

        assertEquals("papa", json.getString("abc.name"));
        assertEquals("b0", json.getJSONArray("abc.children").getJSONObject(0).getString("abc.name"));
        assertEquals("b1", json.getJSONArray("abc.children").getJSONObject(1).getString("abc.name"));
    }

    static class Parent {
        String name;
        List<Child> children;

        public Parent() {
        }

        public String getName() {
            return this.name;
        }

        public List<Child> getChildren() {
            return this.children;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setChildren(List<Child> children) {
            this.children = children;
        }

        public String toString() {
            return "DgraphPrefixNameFilterTest.Parent(name=" + this.getName() + ", children=" + this.getChildren() + ")";
        }
    }

    static class Child {
        String name;

        public Child(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString() {
            return "DgraphPrefixNameFilterTest.Child(name=" + this.getName() + ")";
        }
    }
}