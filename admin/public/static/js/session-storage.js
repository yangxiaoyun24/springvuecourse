SESSION_KEY_COURSE = "SESSION_KEY_COURSE"; //课程管理页面点击大章管理时，保存课程信息
SESSION_KEY_CHAPTER = "SESSION_KEY_CHAPTER"; //大章管理页面点击小节管理时，保存大章信息

SessionStorage = {
  get: function (key) {
    let v = sessionStorage.getItem(key);
    if(v && typeof(v) !== "undefined" && v !== "undefined"){
      return JSON.parse(v);
    }
  },
  set:function (key,data) {
    sessionStorage.setItem(key,JSON.stringify(data));
  },
  remove:function (key) {
    sessionStorage.removeItem(key);
  },
  clearALL:function () {
    sessionStorage.clear();
  }
};

// sessionStorage 是会话缓存，浏览器窗口关闭，缓存就没了
// localStorage 是本地缓存，浏览器关闭后，下次再打开还能读到