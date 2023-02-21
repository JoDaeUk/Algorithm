import java.util.ArrayList;
import java.util.Arrays;

public class treeDFS {
    public static void main(String[] args) {

        treeDFS.tree root = new treeDFS.tree("1");
        treeDFS.tree rootChild1 = root.addChildNode(new treeDFS.tree("2"));
        treeDFS.tree rootChild2 = root.addChildNode(new treeDFS.tree("3"));
        treeDFS.tree leaf1 = rootChild1.addChildNode(new treeDFS.tree("4"));
        treeDFS.tree leaf2 = rootChild1.addChildNode(new treeDFS.tree("5"));
        ArrayList<String> output = dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "5", "3"]

        leaf1.addChildNode(new treeDFS.tree("6"));
        rootChild2.addChildNode(new treeDFS.tree("7"));
        output = dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "6", "5", "3", "7"]
    }

    public static ArrayList<String> dfs(tree node) {
        // TODO:
        // result 리스트 만들고 루트 노드 넣기
        ArrayList<String> result = new ArrayList<>();
        result.add(node.getValue());
        // 아이가 있다면 아이의 수만큼 반복문
        if(node.children != null) {
            for(int i = 0; i < node.getChildrenNode().size(); i++) {
                // 아이 리스트 재귀함수로 만들고 result 리스트에 추가하기
                ArrayList<String> chiList = dfs(node.getChildrenNode().get(i));
                for(String s : chiList){
                    result.add(s);
                }
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

