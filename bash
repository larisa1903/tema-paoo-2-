curl http://localhost:8080/salut
# => Salut, lume!

curl -X PUT "http://localhost:8080/salut?numeNou=Ioana"
# => Numele a fost actualizat la: Ioana

curl http://localhost:8080/salut
# => Salut, Ioana!
