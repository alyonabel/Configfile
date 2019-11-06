# Configfile

***Класс, который считывает конфигурационный файл***

Формат файла следующий:
<li>#Default configuration for JHelp application
<li>#Last modified:
<li>#Sun May 18 00:20:28 MSK 2014
<li>host=localhost
<li>port=12345
<li>version=1.0

В данном файле строки, начинающиеся с символа '#' являются комментарием,остальные строки представляют собой свойства (параметры)приложения: слева от знака '=' стоит имя свойства, а справа - его значение.

Класс, который содержит следующие методы:
<li>а) метод, который выводит на экран содержимое всего файла;
<li>б) метод, который позволяет считать значение свойства по его имени;
<li>в) метод, который позволяет заменить значение свойства с заданным именем;
<li>г) метод, который позволяет перезаписать файл с новыми значениями
параметров.
