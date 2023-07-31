1) Добавил команды DELETE, NONE.
2) Удалил логику DAO
(добавил методы findAll и saveAll в UserRepository и GBRepository).
3) Попытался сделать хэширование данных - 
при создании нового экземпляра UserRepository 
происходить выгрузка в список users, 
и только при команде EXIT весь список users обновляется в файл.