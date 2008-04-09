// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class With extends stmtType {
    public exprType context_expr;
    public exprType optional_vars;
    public stmtType[] body;

    public static final String[] _fields = new String[]
    {"context_expr","optional_vars","body"};

    public With(Token token, exprType context_expr, exprType optional_vars,
    stmtType[] body) {
        super(token);
        this.context_expr = context_expr;
        this.optional_vars = optional_vars;
        this.body = body;
        for(int ibody=0;ibody<body.length;ibody++) {
            addChild(body[ibody]);
        }
    }

    public With(PythonTree tree, exprType context_expr, exprType optional_vars,
    stmtType[] body) {
        super(tree);
        this.context_expr = context_expr;
        this.optional_vars = optional_vars;
        this.body = body;
        for(int ibody=0;ibody<body.length;ibody++) {
            addChild(body[ibody]);
        }
    }

    public String toString() {
        return "With";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitWith(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (context_expr != null)
            context_expr.accept(visitor);
        if (optional_vars != null)
            optional_vars.accept(visitor);
        if (body != null) {
            for (int i = 0; i < body.length; i++) {
                if (body[i] != null)
                    body[i].accept(visitor);
            }
        }
    }

}
