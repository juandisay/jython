// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class excepthandlerType extends PythonTree {
    public exprType type;
    public exprType name;
    public stmtType[] body;
    public int lineno;
    public int col_offset;

    private final static String[] fields = new String[] {"type", "name",
                                                          "body", "lineno",
                                                          "col_offset"};
    public String[] get_fields() { return fields; }

    public excepthandlerType(exprType type, exprType name, stmtType[] body, int
    lineno, int col_offset) {
        this.type = type;
        addChild(type);
        this.name = name;
        addChild(name);
        this.body = body;
        if (body != null) {
            for(int ibody=0;ibody<body.length;ibody++) {
                addChild(body[ibody]);
            }
        }
        this.lineno = lineno;
        this.col_offset = col_offset;
    }

    public excepthandlerType(Token token, exprType type, exprType name,
    stmtType[] body, int lineno, int col_offset) {
        super(token);
        this.type = type;
        addChild(type);
        this.name = name;
        addChild(name);
        this.body = body;
        if (body != null) {
            for(int ibody=0;ibody<body.length;ibody++) {
                addChild(body[ibody]);
            }
        }
        this.lineno = lineno;
        this.col_offset = col_offset;
    }

    public excepthandlerType(int ttype, Token token, exprType type, exprType
    name, stmtType[] body, int lineno, int col_offset) {
        super(ttype, token);
        this.type = type;
        addChild(type);
        this.name = name;
        addChild(name);
        this.body = body;
        if (body != null) {
            for(int ibody=0;ibody<body.length;ibody++) {
                addChild(body[ibody]);
            }
        }
        this.lineno = lineno;
        this.col_offset = col_offset;
    }

    public excepthandlerType(PythonTree tree, exprType type, exprType name,
    stmtType[] body, int lineno, int col_offset) {
        super(tree);
        this.type = type;
        addChild(type);
        this.name = name;
        addChild(name);
        this.body = body;
        if (body != null) {
            for(int ibody=0;ibody<body.length;ibody++) {
                addChild(body[ibody]);
            }
        }
        this.lineno = lineno;
        this.col_offset = col_offset;
    }

    public String toString() {
        return "excepthandler";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("excepthandler(");
        sb.append("type=");
        sb.append(dumpThis(type));
        sb.append(",");
        sb.append("name=");
        sb.append(dumpThis(name));
        sb.append(",");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("lineno=");
        sb.append(dumpThis(lineno));
        sb.append(",");
        sb.append("col_offset=");
        sb.append(dumpThis(col_offset));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (type != null)
            type.accept(visitor);
        if (name != null)
            name.accept(visitor);
        if (body != null) {
            for (int i = 0; i < body.length; i++) {
                if (body[i] != null)
                    body[i].accept(visitor);
            }
        }
    }

}
