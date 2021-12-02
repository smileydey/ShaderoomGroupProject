package edu.example.shaderoom.models;

public class Chats extends BaseChats
{
    private User author;

    public Chats()
    {

    }

    public Chats(String objectId, String title, String content, Date createdAt)
    {
        this.objectId = objectId;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.author = user;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
