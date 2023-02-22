import java.util.ArrayList;

public class treeBFS {
    public static void main(String[] args) {
        treeBFS.tree root = new treeBFS.tree("1");
        treeBFS.tree rootChild1 = root.addChildNode(new treeBFS.tree("2"));
        treeBFS.tree rootChild2 = root.addChildNode(new treeBFS.tree("3"));
        treeBFS.tree leaf1 = rootChild1.addChildNode(new treeBFS.tree("4"));
        treeBFS.tree leaf2 = rootChild1.addChildNode(new treeBFS.tree("5"));
        ArrayList<String> output = bfs(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5"]

        leaf1.addChildNode(new treeBFS.tree("6"));
        rootChild2.addChildNode(new treeBFS.tree("7"));
        output = bfs(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5", "7", "6"]
    }

    public static ArrayList<String> bfs(tree node) {
        // TODO:
        // result 리스트 만들기
        ArrayList<String> result = new ArrayList<>();
        //subList 만들기
        ArrayList<tree> subList = new ArrayList<>();
        subList.add(node);
        // subList가 비어있을때까지 반복
        while (subList.size() > 0){
            tree t = subList.get(0);
            subList.remove(0);

            result.add(t.getValue());
            if(t.getChildrenNode() != null){
                subList.addAll(t.getChildrenNode());
            }

        }

        return result;
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}

