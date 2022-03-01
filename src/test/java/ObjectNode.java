import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectNode {

    public static void main(String[] args) {

        ObjectMapper objectmapper= new ObjectMapper();

 com.fasterxml.jackson.databind.node.ObjectNode objectnode = objectmapper.createObjectNode();

 String jsonValue="";

        objectnode.get(jsonValue);

    }
}
