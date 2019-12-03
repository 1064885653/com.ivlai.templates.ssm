var languageList = [
    {lang: "zh_CN", name: "简体中文"},
    {lang: "zh_TW", name: "繁體中文"},
    {lang: "en_US", name: "English"}
];

$(function () {

    var $select = $("#languageList");
    languageList.forEach(function (value, index, array) {
        var selected = value.lang === lang ? "selected" : "";
        var option = "<option " + selected + " value='" + value.lang + "' title='" + value.name + "'>" + value.name + "</option>"
        $select.append(option)
    });

    $select.change(function (e) {
        window.location.href = window.location.pathname + "?lang=" + this.value;
    })


});