package ru.netology.domain;

public class RepostInfo {
    private int count; // число пользователей, скопировавших запись;
    private boolean userReposted; // наличие репоста от текущего пользователя (1 — есть, 0 — нет).

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }


}
