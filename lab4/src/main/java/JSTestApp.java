package main.java;

import java.io.IOException;

public class JSTestApp extends AllDirectives {
    public static final String ACTOR_SYSTEM_NAME = "js_test_app";

    public static void main(String[] args) throws IOException {
        ActorSystem actorSystem = ActorSystem.create(ACTOR_SYSTEM_NAME);


    }
}
