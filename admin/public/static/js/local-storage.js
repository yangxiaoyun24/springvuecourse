LocalStorage = {
  get:function (key) {
    let v = LocalStorage.getItem(key);
    if(v && typeof(v) !== "undefined" && v !== "undefined"){
      return JSON.parse(v);
    }
  },
  set:function (key,data) {
    LocalStorage.setItem(key,JSON.stringify(data));
  },
  remove:function (key) {
    LocalStorage.removeItem(key);
  },
  clearAll:function () {
    LocalStorage.clear();
  }
};