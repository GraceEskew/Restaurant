class ReservationService {
	getLastName() {
		return axios.get('/guest');
	}
	getTableNum(tableNum) {
		return axios.get('/guest');
	}
}

class TableComponent {
	constructor(tableNum, numSeats, isAvailable) {
		this.tableNum = tableNum;
		this.numSeats = numSeats;
		this.isAvailable = isAvailable;
	}
}
class GuestComponent {
	constructor(firstName, lastName, numInParty) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.numInParty = numInParty;
		this.template = `<div> </div>`;
	}
}
class TableListComponent {
	construtor(ReservationService) {
		ReservationService.getTableNum().then((res) => {
			this.TableListComponent = res.data;
			this.TableComponent = this.TableListComponent.map((e) => e.tableNum);

			this.template = `
            ,<div>
            ${this.TableListComponent.map((e) => new TableComponent(e).template).join('')}
            </div>
            `;
		});
	}
}
class GuestListComponent {
	constructor(ReservationService) {
		ReservationService.getLastName().then((res) => {
			this.GuestListComponent = res.data;
			this.GuestListComponent = this.GuestListComponent.map((e) => e.LastName);

			this.template = `
            ,<div>
            ${this.GuestListComponent.map((e) => new GuestComponent(e).template).join('')}
            </div>            
            `;
			document.getElementById('root').innerHTML = this.template;
		});
	}
}
const service = new ReservationService();
const component = new TableListComponent(service);
const component2 = new GuestListComponent(service);

document.addEventListener('click', function(e) {});
