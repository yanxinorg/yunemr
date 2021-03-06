package jhmk.clinic.cms.function.demo1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DrugNode {
    private String name;
    private String pName;
    private Set<DrugNode> childTrees;
    private Set<String> names;

    public DrugNode() {
    }

    public DrugNode(String name, String pName) {
        this.name = name;
        this.pName = pName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Set<DrugNode> getChildTrees() {
        return childTrees;
    }

    public void setChildTrees(Set<DrugNode> childTrees) {
        this.childTrees = childTrees;
    }

    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }

    boolean hasExist(String name) {

        if (names == null) {
            names = new HashSet<>();
        }
        return name == null ? false : names.contains(name);
    }

    /**
     * insert之前应该要先判断是否存在的，时间匆忙忘记写了
     */
    public void insertChild(DrugNode drugNode) {
        if (childTrees == null) {
            childTrees = new HashSet<>();
            names = new HashSet<>();
        }
        if (!names.contains(drugNode.getName())) {
            childTrees.add(drugNode);
            names.add(name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrugNode drugNode = (DrugNode) o;
        return Objects.equals(name, drugNode.name) &&
                Objects.equals(pName, drugNode.pName) &&
                Objects.equals(childTrees, drugNode.childTrees) &&
                Objects.equals(names, drugNode.names);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, pName, childTrees, names);
    }
}
