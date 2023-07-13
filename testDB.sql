insert into tableC (ID, cardnumber, ISS, ACQ, DEST, STATUS_A, STATUS_ISS, STATUS_ACQ, STATUS_DEST)
select a.iD, a. cardnumber, a.iss, a.acq, a.dest, a.status, b.status
from a.tableA a
join b.tableB b
on a.id = b.id