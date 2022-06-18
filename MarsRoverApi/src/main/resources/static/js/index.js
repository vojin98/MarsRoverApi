   let userId= getUrlParamter("userId")
 if(userId == null || userId=='')
  {
	
	 userId= localStorage.getItem("userId")
}


  if(userId == null && userId==null)
  {
	
	 localStorage.SetItem("userId",userId)
document.getElementById("userId")=valueId
}
  let marsApiButtons =  document.querySelectorAll("'button[id*='marsApi']")
  
  marsApiButtons.forEach(button => button.addEventListener ('click',function() 
  {
	const buttonId = this.id() 
	const roverId = buttonId.split('marsRover')[1]
	const apiData = document.getElementById("marsRoverApiData")
	apiData.value = roverId
	document.getElementById("frmRoverType").submit() 
	

	
}))


function getUrlParameter(name) {
    name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
    var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
    var results = regex.exec(location.search);
    return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
};
  
    let marsRoverType = getUrlParamter("marsApiRoverData")
    

highlightBtnByRoverType(marsRoverType)

let marsSol = getUrlParameter("marsSol")
document.getElementById("marsSol").value = marsSol

function highlightBtnByRoverType(roverType)
{
	if(roverType== '')
roverType = 'Oppurtunity'
	
		document.getElementById('marsApi' + roverType).classList.remove('btn-secondary')
	document.getElementById('    marsApi' + roverType).classList.remove('btn-primary')
	
}