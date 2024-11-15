package UpdatePractice.Decorators.ConcreteComponent;

import UpdatePractice.Decorators.AbstractComponent.Text;

public class SimpleText implements Text {
    private String msg;
    public SimpleText(String msg){
        this.msg=msg;
    }
    @Override
    public String format() {
        return msg;
    }
}
