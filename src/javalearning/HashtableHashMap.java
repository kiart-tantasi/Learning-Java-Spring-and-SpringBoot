package javalearning;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableHashMap {

    public static void main(String[] args) {

//        ------- HASHTABLE (OLDER) -------        //
//        sync, thread-safe, lower performance, null not allowed
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("hashtable", "value hashtable");
        System.out.println(hashtable.get("hashtable"));
//        error will be thrown if null value
//        hashtable.put("null", null);
//        System.out.println(hashtable.get("null"));

//        ------- HASHMAP (NEWER) -------        //
//        async, multi-thread, non-thread-safe, higher performance, null allowed for both key and value
        HashMap<String ,String> hashMap = new HashMap<>();
        hashMap.put("hashmap", "value hashmap");
        System.out.println(hashMap.get("hashmap"));
//        *** Hashmap can keep null value while hashtable can't.
        hashMap.put("null", null);
        System.out.println(hashMap.get("null"));
    }
}
