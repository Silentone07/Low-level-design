package com.example.practice.lrucache;

import lombok.Data;

import java.util.HashMap;

@Data
public class LRUCacheService {

    private int capacity;
    HashMap<String,CacheNode>mp=new HashMap<>();
    CacheNode head;
    CacheNode tail;

    public LRUCacheService(int capacity) {
         this.capacity=capacity;
    }

    public int get(String key) {
        CacheNode node=mp.get(key);
        if(node==null) {
             return -1;
        }
            addToFront(node);
             return node.value;
    }
    private  void addToFront(CacheNode node) {
         node.next=head.next;
         node.prev=head;
         head.next.prev=node;
         head.next=node;
    }

    private CacheNode deleteFromTail() {
        CacheNode lru=tail.prev;
         removeNode(lru);
       // tail.prev=lru.prev;
         return lru;


    }

    public void removeNode(CacheNode node) {
         node.prev.next=node.next;
         node.next.prev=node.prev;
    }

    private void moveToFront(CacheNode node) {
        removeNode(node);
        addToFront(node);
    }
    public void put(String key, int value) {
        CacheNode node=mp.get(key);
        if(node!=null) {
            node.value=value;
            mp.put(key,node);
            moveToFront(node);
            return;
        } else {
            if(mp.size()==capacity) {
                CacheNode lru=deleteFromTail();
                mp.remove(lru.key);
            }  else {
                CacheNode node1=new CacheNode(key,value);
                addToFront(node1);
                mp.put(key,node1);
            }

        }
    }

}
