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