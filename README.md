Конвертер из СЭД Дело в СЭД Directum

***Запуск утилиты из cmd:***
 
`java -jar %path%\converter.jar [путь до каталога с файлами] [returnId] [направление преобразования] [messageId]`

***
***Возвращаемые коды:***

*-1*: Неудачный запуск утилиты(Неправильно переданы параметры)

*0*: Всё ок

*1*: Ошибка обработки файлов

***
***Пример:***

Дело->Directum:
`java -jar C:\converter.jar C:\Users\Documents\ConvertFile\da2c1754f9db11e88eb2f2801f1b9fd1 da2c1754f9db11e88eb2f2801f1b9fd1 true d7a39d8f-65f84bb9b26cc428773a17bd`

Directum->Дело:
`java -jar C:\converter.jar C:\Users\Documents\ConvertFile\da2c1754f9db11e88eb2f2801f1b9fd1 da2c1754f9db11e88eb2f2801f1b9fd1 false d7a39d8f-65f84bb9b26cc428773a17bd`
