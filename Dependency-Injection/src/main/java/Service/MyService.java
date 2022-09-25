package Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {


    @Autowired
    private String MyComponent;

    public MyService(String myComponent) {
        MyComponent = myComponent;
    }


    private void getMyComponentName() {

    }


}
